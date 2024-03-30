package task_1;

// Принцип единственной ответственности (Single Responsibility Principle)
// Заключается в том, что класс Pair решает только одну задачу -  
// хранение пары значений любого типа и предоставление методов для работы с этими значениями.  
// Вся логика связанная с парой значений инкапсулирована в этот класс,  
// что позволяет более эффективно использовать его в других частях программы. 

// Принцип открытости/закрытости (Open/Closed Principle)  
// Заключается в отсутствии зависимости от других классов.  

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