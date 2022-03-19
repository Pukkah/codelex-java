package io.codelex.oop.cars;

public enum Operator {
    EQUAL_TO {
        @Override
        public boolean compare(int value1, int value2) {
            return value1 == value2;
        }
    },
    NOT_EQUAL_TO {
        @Override
        public boolean compare(int value1, int value2) {
            return value1 != value2;
        }
    },
    GREATER_THAN {
        @Override
        public boolean compare(int value1, int value2) {
            return value1 > value2;
        }
    },
    LESS_THAN {
        @Override
        public boolean compare(int value1, int value2) {
            return value1 < value2;
        }
    },
    GREATER_THAN_OR_EQUAL_TO {
        @Override
        public boolean compare(int value1, int value2) {
            return value1 >= value2;
        }
    },
    LESS_THAN_OR_EQUAL_TO {
        @Override
        public boolean compare(int value1, int value2) {
            return value1 <= value2;
        }
    };

    public abstract boolean compare(int value1, int value2);

}
