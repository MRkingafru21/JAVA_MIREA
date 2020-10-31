package PRACTICE9.Task1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

public class OnlineShopSupport {

    /**
     * Хеш-таблица, где ключ - фамилия покупателя, значение - ИНН покупателя
     */
    public static HashMap<String, BigDecimal> map  = new HashMap<>() {{
        put("Староволков", BigDecimal.valueOf(1234567777));
        put("Успенский", BigDecimal.valueOf(Long.parseLong("126891832114")));
        put("Солдатов", BigDecimal.valueOf(1471647362));
        put("Рожков", BigDecimal.valueOf(1621773217));
        put("Ручкин", BigDecimal.valueOf(Long.parseLong("178327467101")));
        put("Галдин", BigDecimal.valueOf(1137368890));
    }};

    @Override
    public String toString() {
        return String.valueOf(map);
    }

    /**
     * Проверяет на корректность ИНН, для простоты считаем, что любой ИНН длины 10 или 12 корректен
     * @param taxPayerIdNumber ИНН физического или юридического лица
     * @return true - для корректных ИНН, false - для некорректных ИНН
     */
    public static boolean isTaxpayerIdNumberValid(BigDecimal taxPayerIdNumber) {
        return taxPayerIdNumber.toString().length() == 10 || taxPayerIdNumber.toString().length() == 12;
    }

    /**
     * @param surname Фамилия покупателя
     * @param taxpayerIdNumber ИНН покупателя
     * @return true - Фамилия соответствует ИНН, false - Фамилия не соответствует ИНН
     */
    public static boolean checkAccordance(String surname, BigDecimal taxpayerIdNumber) {
        if (map.containsKey(surname)) {
            return map.get(surname).equals(taxpayerIdNumber);
        } else {
            return false;
        }
    }
}
