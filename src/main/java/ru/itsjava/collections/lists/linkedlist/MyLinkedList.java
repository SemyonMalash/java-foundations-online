package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedList {
    private Node head;

    public int size() {
        int count = 0;
        Node curNode = head;
        while (curNode != null) {
            curNode = curNode.getNext();
            count++;
        }
        return count;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        while (curNode != null) {
            if (o == curNode.getValue()) {
                return true;
            }
            curNode = curNode.getNext();
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public void add(int index, Object o) {
        checkIndex(index);
        Node curNode = head;
        int indexCount = 0;
        if (index == 0) {
            head = new Node(o, curNode);
        } else {
            while (curNode != null) {
                Node prevNode = curNode;
                curNode = curNode.getNext();
                indexCount++;
                if (index == indexCount) {
                    Node resNode = new Node(o, curNode);
                    prevNode.setNext(resNode);
                    break;
                }
            }
        }
    }


    //Метод с модификатором доступа public, тип boolean, название remove, параметр тип Object, название o
    public boolean remove(Object o) {
        //Если первый элемент списка равен null, возвращаем false
        if (head == null) return false;
        //Если значение первого элемента списка равно значению удаляемого
        if (head.getValue().equals(o)) {
            //Первый элемент списка становится равен следующему
            head = head.getNext();
            //Возвращаем true
            return true;
        }
        //Если второй элемент списка равен null, возвращаем false
        if (head.getNext() == null) return false;
        //Объявляем переменную curNode типа Node, присваиваем ей значение первого элемента списка
        Node curNode = head;
        //Объявляем переменную prevNode типа Node, присваиваем ей значение первого элемента списка
        Node prevNode = head;
        //Присваиваем текущему элементу списка значение следующиего, пока значение следующего не равно null
        while ((curNode = curNode.getNext()) != null) {
            //Если значение текущего элемента равно значению удаляемого
            if (curNode.getValue().equals(o)) {
                //Выходим из цикла
                break;
            }
            //Присваиваем переменной prevNode значение следующего элемента
            prevNode = prevNode.getNext();
        }
        //Если текущий элемент равен null, возвращаем false
        if (curNode == null) return false;
        //Меняем ссылку предыдущего элемента на ссылку текущего элемента
        prevNode.setNext(curNode.getNext());
        //Делаем ссылку текущего элемента равной null
        curNode.setNext(null);
        //Возвращаем правду
        return true;
    }

    public void clear() {
        Node curNode = head;
        while (curNode != null) {
            curNode.setValue(null);
            Node nextNode = curNode.getNext();
            curNode.setNext(null);
            curNode = nextNode;
        }
        head = null;
    }

    public Object get(int index) {
        Node curNode = head;
        int count = 0;

        while (curNode != null) {
            if (count == index) {
                return curNode;
            }
            curNode = curNode.getNext();
            count++;
        }
        return null;
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        Node curNode = head;
        int count = 0;

        while (curNode != null) {
            if (count == index) {
                break;
            }
            curNode = curNode.getNext();
            count++;
        }
        curNode.setValue(element);
        return true;
    }

    // СТРОКА1 -> null
    // СТРОКА1 -> СТРОКА2 -> СТРОКА3 -> null
    //Объявляем метод с модификатором доступа public, тип Object, название remove, параметр тип int, название index
    public Object remove(int index) {
        //Проверяем корректность индекса
        checkIndex(index);
        //Если индекс равен нулю
        if (index == 0) {
            //Объявляем переменную типа Object с названием resValue и значением первого элемента
            //Запоминаем значение первого элемента
            Object resValue = head.getValue();
            //Первый элемент делаем равным второму
            head = head.getNext();
            //Возвращаем resValue
            return resValue;
        }
        //Объявляем переменную типа Node с названием curNode, делаем её равной первому элементу
        Node curNode = head;
        //Объявляем переменную типа Node с названием prevNode, делаем её равной первому элементу
        Node prevNode = head;
        //Объявляем переменную типа int с названием count, делаем её равной нулю
        int count = 0;
        //Присваиваем текущему элементу списка значение следующего, пока значение следующего не равно null
        while ((curNode = curNode.getNext()) != null) {
            //Увеличиваем счётчик на 1
            count++;
            //Если счётчик равен индексу
            if (count == index) {
                //Выходим из цикла
                break;
            }
            //Предыдущий элемент равен следующиему
            prevNode = prevNode.getNext();
        }
        //Объявляем переменную типа Object с названием resValue и значением текущего элемента
        //Запоминаем значение текущего элемента
        Object resValue = curNode.getValue();
        //Если элемент следующий за текущим равен null
        if (curNode.getNext() == null) {
            //Делаем ссылку предыдущего элемента равной null
            prevNode.setNext(null);
            //Иначе меняем ссылку предыдущего элемента на ссылку текущего элемента
        } else {
            prevNode.setNext(curNode.getNext());
            //Делаем ссылку текущего элемента равной null
            curNode.setNext(null);
        }
        //Возвращаем значение удалённого элемента
        return resValue;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index <= size())) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        int index = 0;
        Node curNode = head;
        while (curNode != null) {
            if (curNode.getValue() == o) {
                return index;
            }
            index++;
            curNode = curNode.getNext();
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int index = 0;
        int resIndex = 0;
        Node curNode = head;
        while (curNode != null) {
            if (curNode.getValue() == o) {
                resIndex = index;
            }
            index++;
            curNode = curNode.getNext();
        }
        return resIndex;
    }

    @Override
    public String toString() {
        return "MyLinkedList {" +
                "head = " + head +
                '}';
    }
}
