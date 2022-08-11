package lesson08.Registration;


import lesson08.Registration.Document.Documents;

public class Register implements Show {

    Documents[] registers = new Documents[10];

    public Documents[] addDocumentToRegister(Documents docToAdd) {
        for (int i = 0; i < registers.length; i++) {
            if (registers[i] != null) {
                registers[i] = docToAdd;
            }
            System.out.println("Документ добавлен");
            break;
        }
        return registers;
    }

    @Override
    public void showInformation() {
        System.out.println();

    }
}
