import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

class TextClassificationState extends ChangeNotifier {
  final TextEditingController controller = TextEditingController();

  String prediction = "";

  String url = 'http://10.0.2.2:5000';

  bool isLoading = false;
  bool isButtonPressed = false;

  void updateIsloading({required bool val}) {
    isLoading = val;
    notifyListeners();
  }

  void updateIsButtonPressed({required bool val}) {
    isButtonPressed = val;
    notifyListeners();
  }

  void updatePrediction({required String val}) {
    prediction = val;
    notifyListeners();
  }

  Future<void> analyzeText(String inputText) async {
    updateIsloading(val: true);

    updatePrediction(val: "");

    final uri = Uri.parse('$url/predict');
    try {
      final response = await http.post(
        uri,
        headers: {"Content-Type": "application/json"},
        body: jsonEncode({"text": inputText}),
      );
      await Future.delayed(const Duration(seconds: 2));
      if (response.statusCode == 200) {
        final data = json.decode(response.body);

        updatePrediction(val: data['prediction'] ?? "No prediction");
      } else {
        updatePrediction(val: "Failed to get prediction");
      }
    } catch (e) {
      updatePrediction(val: "Error connecting to server");
    } finally {
      updateIsloading(val: false);
    }
  }
}
