public class Main {
    public static void main(String[] args){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastname = "Ivanov";
        String fullName = (lastname + " " + middleName + " " + lastname);
        System.out.println(fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета — "  +fullName.toUpperCase());

        String fullname2 = "Иванов Семён Фёдорович";
        fullname2 = fullname2.replace('ё', 'е');
        System.out.println(fullname2);

    }

}