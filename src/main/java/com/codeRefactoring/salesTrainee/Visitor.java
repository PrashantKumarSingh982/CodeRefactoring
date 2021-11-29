package com.codeRefactoring.salesTrainee;

public interface Visitor {
    public double visit(SalesTrainee trainee);
    public double visit(Salesman salesman);
    public double visit(Boss boss);
}
