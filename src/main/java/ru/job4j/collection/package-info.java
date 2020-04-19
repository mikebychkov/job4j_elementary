package ru.job4j.collection;

/**
1. Что такое "коллекция".

    Коллекции - это классы, позволяющие работать с наборами однотипных данных.


1.1. Перечислите основные методы из интерфейса java.util.Collection.

    public interface Collection<E> { // <E> обобщение
        boolean add(E element);
        boolean remove(E element);
        boolean equals(Object o)
        boolean contanes(Object o);
        Object[] toArray();
        int size();
        void clear();
        Iterator<E> iterator();
    }


2. Назовите преимущества использования коллекций.

    При работе с ArrayList не нужно использовать index. То есть коллекции обеспечивают удобный интерфейс по сравнению с массивом.


3. Какие данные могут хранить коллекции?

    любые однотипные данные


4. Какие есть типы коллекций? Как они характеризуются?

    List, Set, Map

    java.util.Set - классы реализующие этот интерфейс не могут содержать дубликаты элементов. Их также называют множества.
    В коллекциях типа java.util.Set не возможности указать индекс.
    Коллекции java.util.Set не поддерживают замену элементов, потому что нет возможности явно указать ячейку.
    Уникальность элементов в HashSet проверяется через методы equals и hashCode.
    Если мы хотим хранить в HashSet пользовательские объекты данных нам нужно обеспечить эти модели методами equals и hashCode.
    TreeSet требует от входящего типа данных поддержания интерфейса java.util.Comparable.

    java.util.Map - коллекции - ключ и значение.
    void put(K key, V value);
    V get(K key);
    keySet()
    entrySet()


5. Назовите основные реализации List, Set, Map.

    List(ArrayList, LinkedList), Set(HashSet, TreeSet), Map(HashMap)


6. В чём отличие ArrayList от LinkedList?

    ArrayList реализует интерфейс List
    LinkedList реализует интерфейс List, Dequeue, Queue
    LinkedList есть методы addFirst(), addLast(), getFirst(), getLast(), removeFirst(), removeLast()


7. В чём отличие HashSet от TreeSet?

    TreeSet элементы автоматически сортируются


8. В чём отличие Set от Map?

    Set это множество уникальных значений
    Map это список пар: ключ и значение


9. Как задается порядок следования объектов в коллекции, как отсортировать коллекцию?

    List - по индексу
    Set - нет порядка
    Map - по ключу

    Collections.sort(object, comparator)


10. Чем отличается Comparable от Comparator?

    Comparable метод compareTo(E o)
    Comparator метод compare(E o1, E o2)


12. Что такое equals и hashcode?

    функция использующиеся для сравнения объектов.


13. Какие есть способы перебора всех элементов List?

    По индексу, цикл "для каждого", итератор hasNext() next()
*/
