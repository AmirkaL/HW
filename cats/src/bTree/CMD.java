package bTree;
import java.util.Scanner;

class binTree
{
    binTree left, right;
    int data;

    /*конструктор*/
    public binTree(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    /* добавление в левую часть*/
    public void setLeft(binTree n)
    {
        left = n;
    }
    /* добавление в правую часть*/
    public void setRight(binTree n)
    {
        right = n;
    }
    /* получение левой части */
    public binTree getLeft()
    {
        return left;
    }
    /* получение правой части */
    public binTree getRight()
    {
        return right;
    }

    /* получение списка */
    public int getData()
    {
        return data;
    }
}

class Checking
{
    private binTree glav;

    /* конструктор */
    public Checking()
    {
        glav = null;
    }
    /* вставка данных */
    public void insert(int data)
    {
        glav = insert(glav, data);
    }
    private binTree insert(binTree num, int data)
    {
        if (num == null)
            num = new binTree(data);
        else
        {
            if (data <= num.getData())
                num.left = insert(num.left, data);
            else
                num.right = insert(num.right, data);
        }
        return num;
    }
    /* удаление данных */
    public void delete(int k)
    {
        glav = delete(glav, k);
        System.out.println(k+ " удалено");
    }
    private binTree delete(binTree lict, int v)
    {
        binTree r, r2, z;
        if (lict.getData() == v)
        {
            binTree left, right;
            left = lict.getLeft();
            right = lict.getRight();
            if (left == null && right == null)
                return null;
            else if (left == null)
            {
                r = right;
                return r;
            }
            else if (right == null)
            {
                r = left;
                return r;
            }
            else
            {
                r2 = right;
                r = right;
                while (r.getLeft() != null)
                    r = r.getLeft();
                r.setLeft(left);
                return r2;
            }
        }
        if (v < lict.getData())
        {
            z = delete(lict.getLeft(), v);
            lict.setLeft(z);
        }
        else
        {
            z = delete(lict.getRight(), v);
            lict.setRight(z);
        }
        return lict;
    }
    /* ф-я кол-во элементов */
    public int countNodes()
    {
        return countNodes(glav);
    }
    private int countNodes(binTree r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    /* поиск элементов */
    public boolean search(binTree r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    /* ф-я списка по мере записи */
    public void preorder()
    {
        preorder(glav);
    }
    private void preorder(binTree r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
    /* ф-я упорядоченного списка */
    public void postorder()
    {
        postorder(glav);
    }
    private void postorder(binTree r)
    {
        if (r != null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }
}

public class CMD
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* объект проверки */
        Checking bst = new Checking();
        char prod;
        /*  команды  */
        do
        {
            System.out.println("Вставка - 1 ");
            System.out.println("Удаление - 2");
            System.out.println("Кол-во элементов - 3");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Вставьте число");
                    bst.insert( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Вставьте число для удаления");
                    bst.delete( scan.nextInt() );
                    break;
                case 3 :
                    System.out.println("Кол-во элементов:  "+ bst.countNodes());
                    break;

            }
            System.out.print("\nСписок по мере записи: ");
            bst.postorder();
            System.out.print("\nУпорядоченный список : ");
            bst.preorder();

            System.out.println("\nВыбрать функцию - y || Закончить - n \n");
            prod = scan.next().charAt(0);
        } while (prod == 'Y'|| prod == 'y');
    }
}