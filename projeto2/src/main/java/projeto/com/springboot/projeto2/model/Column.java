package projeto.com.springboot.projeto2.model;

public @interface Column {

    boolean nullable();

    boolean unique();

    int length();

}
