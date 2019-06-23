public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      String[] numbers = line.split(";");
      double price = Double.parseDouble(numbers[0]);
      double money = Double.parseDouble(numbers[1]);
      if (price > money) {
        System.out.println("ERROR");
      }
      if (price == money) {
        System.out.println("ZERO");
      }
      String[] name = {"PENNY", "NICKLE", "DIME", "QUARTER", "HALF DOLLAR", "ONE",
                          "TWO", "FIVE", "TEN", "TWENTY", "FIFTY", "ONE HUNDRED"};
      double[] value = {0.01, 0.05, 0.10, 0.25, 0.50, 1.00, 2.00, 5.00, 10.00, 20.00, 50.00, 100.00};
      List<String> result = new ArrayList<>();
      double change = money - price;
      int numOfCurrency = value.length;
      int index = numOfCurrency - 1;
      
      while (change != 0) {
        double currentVal = value[index];
        while (change < currentVal) {
          index -= 1;
          currentVal = value[index];
        }
        result.add(name[index]);
        change -= change / currentVal * currentVal;
      }
      
      /*
      for (int i = 0; i < result.size() - 1; i++) {
        result.get(i) += ", ";
      }
      */
      for (int i = 0; i < result.size(); i++) {
        System.out.print(result.get(i));
      }