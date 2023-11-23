package ru.chermashentsev.etc;

public enum Operations {
    PLUS {
        @Override
        public int make(int x, int y) {
            return x + y;
        }

        @Override
        public String toString() {
            return name();
        }
    },
    MINUS {
        @Override
        public int make(int x, int y) {
            return x - y;
        }
    },
    MULT {
        @Override
        public int make(int x, int y) {
            return x * y;
        }
    },
    DIV {
        @Override
        public int make(int x, int y) {
            return x / y;
        }
    };

    abstract public int make(int x, int y);
}
