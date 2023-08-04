public interface AddInAutomat<T extends Product> {
    //Принцип разделения интерфейса
    //Принцип подстановки Барбары Лисков
    void addInAutomat(T product);
}
