import 'dart:ui';
import 'package:flutter/material.dart';
import 'package:flutter_text_classification_markov_model/page/markov_model/text_classification_state.dart';
import 'package:flutter_text_classification_markov_model/page/markov_model/widget/bg.dart';
import 'package:flutter_text_classification_markov_model/page/markov_model/widget/input.dart';
import 'package:flutter_text_classification_markov_model/page/markov_model/widget/loading.dart';
import 'package:flutter_text_classification_markov_model/page/markov_model/widget/prediction.dart';
import 'package:provider/provider.dart';

class TextClassificationPage extends StatelessWidget {
  const TextClassificationPage({super.key});

  @override
  Widget build(BuildContext context) {
    return ChangeNotifierProvider(
      create: (_) => TextClassificationState(),
      child: Consumer(
        builder: (BuildContext context, TextClassificationState state, _) {
          return Stack(
            children: [
              BgTextClassification(),
              Scaffold(
                backgroundColor: Colors.transparent,
                body: Center(
                  child: SingleChildScrollView(
                    padding: const EdgeInsets.all(24.0),
                    child: ClipRRect(
                      borderRadius: BorderRadius.circular(24.0),
                      child: BackdropFilter(
                        filter: ImageFilter.blur(sigmaX: 10, sigmaY: 10),
                        child: Container(
                          padding: const EdgeInsets.all(24.0),
                          decoration: BoxDecoration(
                            color: Colors.white.withValues(alpha: 0.1),
                            borderRadius: BorderRadius.circular(24.0),
                            border: Border.all(color: Colors.white30),
                          ),
                          child: Column(
                            mainAxisSize: MainAxisSize.min,
                            children: [
                              Input(state: state),
                              Visibility(
                                visible: state.isLoading,
                                child: Container(
                                  margin: const EdgeInsets.only(top: 24.0),
                                  child: LoadingWithSimmer(),
                                ),
                              ),
                              Visibility(
                                visible:
                                    (state.prediction.isNotEmpty &&
                                    !state.isLoading),
                                child: Container(
                                  margin: const EdgeInsets.only(top: 24.0),
                                  child: Prediction(
                                    prediction: state.prediction,
                                  ),
                                ),
                              ),
                            ],
                          ),
                        ),
                      ),
                    ),
                  ),
                ),
              ),
            ],
          );
        },
      ),
    );
  }
}
