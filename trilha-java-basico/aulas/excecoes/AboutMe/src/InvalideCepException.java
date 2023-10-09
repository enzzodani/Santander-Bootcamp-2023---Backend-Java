public class InvalideCepException extends Throwable {
    public static void main(String[] args) {
        try {
            String myFormatCep = formatCep("23765064");
            System.out.println(myFormatCep);
        } catch (InvalideCepException e) {
            System.out.println("Cep is not match with business rule");
        }
    }
    static String formatCep(String cep) throws InvalideCepException{
        if(cep.length() != 8)
            throw new InvalideCepException();

        //simulate a format cep
        return "23.765-064";
    }
}
