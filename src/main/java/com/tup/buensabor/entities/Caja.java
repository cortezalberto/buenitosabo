package com.tup.buensabor.entities;

class Caja<T,U> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void inspect(U u) {
        System.out.println("U: " + u.getClass().getName());
    }
}