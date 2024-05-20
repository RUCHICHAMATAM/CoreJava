public class AverageOfAge {
    public static void main(String[] args) {
        String ageRawData[]={"35","26","32","44"};
       String result= AverageOfAge.averageAgeCalculator( ageRawData);
        System.out.println("output="+result);
    }public static String averageAgeCalculator(String[] ageRawData) {
        for (int i = 0; i < ageRawData.length; i++) {
            for (int j = 0; j < ageRawData[i].length(); j++) {
                char ch = ageRawData[i].charAt(j);
                if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                    return "java.lang.NumberFormatException: For input string: " + ageRawData[i];
                }}}
        double total=0;
        double avg = 0;
        for (int i = 0; i < ageRawData.length; i++) {
            total=total+ Integer.parseInt(ageRawData[i]);
        }
        avg=total/ ageRawData.length;
        String average=Double.toString(avg);
        return average;
    }


}
