package employeemanager.models.implementations;

import employeemanager.models.MyEmployee;

public class Accountant_old extends MyEmployee {

    //public String welcome = "Hello, I am a new programmer(accountant/manager)";
    public void calculate() {
        System.out.println("Accountant: calculate.");
    }
    
    @Override   /*аннотация. компилятор проверит реально ли вы сделали override. 
                * если нам важно знать сделали ли мы override приавильно, то надо это использовать
                * компилятор проверит - и если нет, то выдаст ошибку  */
    public void work() { //мы ovverride этот метод с класса MyEmployee
        super.work(); // это сохранение оригинального метода из класса MyEmployee. что-то типо this
        calculate();
    }
}

class AccountantDemo {

    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        emp.work();

        Accountant_old acc = new Accountant_old();
        acc.work();
    }
}
