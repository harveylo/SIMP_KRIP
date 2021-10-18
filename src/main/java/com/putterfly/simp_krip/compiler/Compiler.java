package com.putterfly.simp_krip.compiler;

public class Compiler {

    public static void main(String[] args) {
        Variable a = new Variable("a", VariableType.Int, 1);
        Variable b = new Variable("a", VariableType.Int, 1);
        if (a.equals(b)) {
            System.out.println("111111");
        } else {
            System.out.println("2222");
        }
    }
}

