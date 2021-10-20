import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String,Double> exchangeRates = new HashMap<>();

    public CurrencyConverter(){
        exchangeRates.put("Universal Currency", 1.00);
        exchangeRates.put("Us Dollar", 2.00);
        exchangeRates.put("Euro", 1.88);
        exchangeRates.put("British Pound", 1.64);
        exchangeRates.put("Indian Rupee", 136.64);
        exchangeRates.put("Australian Dollar", 2.70);
        exchangeRates.put("Canadian Dollar", 2.64);
        exchangeRates.put("Singapore Dollar", 2.86);
        exchangeRates.put("Swiss Franc", 2.02);
        exchangeRates.put("Malaysian Ringgit", 8.94);
        exchangeRates.put("Japanese Yen", 231.68);
        exchangeRates.put("Chinese Yuan Renminbi", 13.84);
    }

    public Double convertCurrency(String curFromName,String curToName,Double amount){
        Double amountToUniversal=0.0;
        Double con2ExchnageRate=0.0;
        for(Map.Entry entry : exchangeRates.entrySet()){
            String exchangeName = entry.getKey().toString();
            Double exchangeRate = (Double)entry.getValue();

            if (curFromName.equalsIgnoreCase(exchangeName)){
                 amountToUniversal= amount/exchangeRate;

            }
            if (curToName.equalsIgnoreCase(exchangeName))
                con2ExchnageRate = exchangeRate;

        }
        return amountToUniversal*con2ExchnageRate;

    }

}
