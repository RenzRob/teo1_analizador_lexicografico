package org.example;

public enum Token {
    ID,
    CTE_STR,
    CTE_F,
    CTE_E,
    CTE_B,
    CTE_BOOL,

    TYPE_FLOAT,
    TYPE_INT,
    TYPE_BOOL,
    TYPE_STRING,

    OP_SUMA,
    OP_RESTA,
    OP_MULTIPLICACION,
    OP_DIVISION,

    OPL_AND,
    OPL_OR,
    OPL_NOT,

    A_PARENT,
    C_PARENT,
    A_LLAVE,
    C_LLAVE,
    A_CORCHETE,
    C_CORCHETE,
    COMA,
    P_Y_C,
    GUION_BAJO,

    IF,
    ELSE,
    WHILE,
    INI_DECLARE,
    END_DECLARE,
    INI_PROGRAM,
    END_PROGRAM,
    FILTER,
    WRITE,

    OP_IGUAL,
    OP_DIST,
    OP_DECLARACION,
    OP_ASIGNACION,
    OP_MENOR,
    OP_MENOR_IG,
    OP_MAYOR,
    OP_MAYOR_IG,

    EOF
}
