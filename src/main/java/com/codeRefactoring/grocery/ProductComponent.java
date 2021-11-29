package com.codeRefactoring.grocery;

public abstract class ProductComponent {

    void add(ProductComponent newProductComponent) {
    }

    void remove(ProductComponent newProductComponent) {
    }

    ProductComponent getProductComponent(int componentIndex) {
        return null;
    }

    String getProductGroupName() {
        return null;
    }

    abstract void displayProductInfo();
}