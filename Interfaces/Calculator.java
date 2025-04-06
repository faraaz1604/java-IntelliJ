package Interfaces;

public enum Calculator implements Operation{
    ADD{
        public int apply(int a , int b){
            return a+b;
        }
    },
    SUB{
        public int apply(int a , int b){
            return a-b;
        }
    },
    MUL{
        public int apply(int a , int b){
            return a*b;
        }
    },
    DIV{
        public int apply(int a , int b){
            return a/b;
        }
    };
}
