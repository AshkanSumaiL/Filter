package com.company.commands;

public class Constants {
    public enum COMMANDS {
        LOAD("LOAD"),
        FILTER("FILTER"),
        FILTER_AND("FILTER_AND"),
        FILTER_OR("FILTER_OR"),
        HELP("HELP"),
        EXIT("EXIT");

        private final String text;

        COMMANDS(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public enum NUMBER_FILTER {
        PALINDROME("PALINDROME"),
        EVEN("EVEN"),
        ODD("ODD"),
        PRIME("PRIME"),
        MULTIPLE_OF_7("MULTIPLE_OF_7"),
        MULTIPLE_OF_11("MULTIPLE_OF_11");

        private final String text;

        NUMBER_FILTER(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public enum WORD_FILTER {
        PALINDROME("PALINDROME"),
        ALL_VOWELS("ALL_VOWELS"),
        DIPHTHONG("DIPHTHONG"),
        TRIPHTHONG("TRIPHTHONG");

        private final String text;

        WORD_FILTER(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }
}
