// ignore_for_file: public_member_api_docs, sort_constructors_first
import 'package:flutter/material.dart';

import 'package:flutter_text_classification_markov_model/page/markov_model/text_classification_state.dart';
import 'package:google_fonts/google_fonts.dart';

class Input extends StatelessWidget {
  final TextClassificationState state;
  const Input({Key? key, required this.state}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Text(
          'Text Analyzer',
          style: GoogleFonts.poppins(
            fontSize: 28,
            fontWeight: FontWeight.bold,
            color: Colors.white,
          ),
        ),
        const SizedBox(height: 16),
        TextField(
          controller: state.controller,
          decoration: InputDecoration(
            filled: true,
            fillColor: Colors.white.withValues(alpha: 0.2),
            hintText: 'Enter a poem line...',
            hintStyle: const TextStyle(color: Colors.white70),
            border: OutlineInputBorder(
              borderRadius: BorderRadius.circular(12),
              borderSide: BorderSide.none,
            ),
          ),
          style: const TextStyle(color: Colors.white),
          maxLines: null,
        ),
        const SizedBox(height: 16),
        GestureDetector(
          onTapDown: (_) {
            state.updateIsButtonPressed(val: true);
          },
          onTapUp: (_) {
            state.updateIsButtonPressed(val: false);
          },
          onTapCancel: () {
            state.updateIsButtonPressed(val: false);
          },
          onTap: () {
            FocusScope.of(context).unfocus();
            if (state.controller.text.trim().isNotEmpty) {
              state.analyzeText(state.controller.text.trim());
            }
          },
          child: AnimatedContainer(
            duration: const Duration(milliseconds: 200),
            padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 12),
            decoration: BoxDecoration(
              color: state.isButtonPressed
                  ? Colors.white.withValues(alpha: 0.2)
                  : Colors.white.withValues(alpha: 0.3),
              borderRadius: BorderRadius.circular(12),
              boxShadow: [
                if (!state.isButtonPressed)
                  const BoxShadow(
                    color: Colors.black26,
                    blurRadius: 10,
                    offset: Offset(0, 4),
                  ),
              ],
            ),
            child: const Text(
              'Analyze Text',
              style: TextStyle(
                color: Colors.white,
                fontSize: 16,
                fontWeight: FontWeight.w500,
              ),
            ),
          ),
        ),
      ],
    );
  }
}
