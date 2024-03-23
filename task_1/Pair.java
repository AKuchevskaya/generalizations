package task_1;

public  class Pair<T, U> {
    T first;
    U second;

    Pair(){
        this.first = null;
        this.second = null;
    }
    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    // Методы для получения первого и второго элемента пары
    T getFirst(){
        return first;
    }

    U getSecond(){
        return second;
    }

    // Методы для установки значений первого и второго элемента пары
    void setFirst(T first){
        this.first = first;
    }

    void setSecond(U second){
        this.second = second;
    }
}