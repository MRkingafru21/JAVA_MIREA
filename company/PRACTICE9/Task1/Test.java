package PRACTICE9.Task1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        String surname = "";
        String next = "y";
        boolean correct = true;
        BigDecimal taxpayerIdNumber = BigDecimal.valueOf(0);
        Scanner keyboard = new Scanner(System.in);

        System.out.println(OnlineShopSupport.map);

        while (!next.equals("n")) {
            try {
                System.out.println("Введите фамилию покупателя:");
                surname = keyboard.next();
                System.out.println("Введите ИНН покупателя: ");
                taxpayerIdNumber = keyboard.nextBigDecimal();
                if (!OnlineShopSupport.isTaxpayerIdNumberValid(taxpayerIdNumber) ||
                        !OnlineShopSupport.checkAccordance(surname, taxpayerIdNumber)) {
                    throw new Exception();
                }
            } catch (Exception err) {
                if (!OnlineShopSupport.checkAccordance(surname, taxpayerIdNumber)) {
                    System.out.println("ИНН не соответствует фамилии");
                    correct = false;
                    throw new TaxpayerIdNumberException("ИНН не соответствует фамилии", err);
                }

                if (!OnlineShopSupport.isTaxpayerIdNumberValid(taxpayerIdNumber)) {
                    System.out.println("Введен неправильный ИНН");
                    correct = false;
                    throw new TaxpayerIdNumberException("Введен неправильный ИНН", err);
                }

                System.out.println("Другая ошибка:(");
                correct = false;
                throw new TaxpayerIdNumberException("Другая ошибка:(", err);
            } finally {
                if (correct) {
                	System.out.println("Фамилия соответствует привязанному ИНН");
                    System.out.println("Чтобы продолжить введите 'y' или 'n' для завершения программы");
                    next = keyboard.next();
                }
            }
        }

    }
}
