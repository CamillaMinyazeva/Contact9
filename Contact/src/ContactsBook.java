import java.util.ArrayList;

public class ContactsBook <T extends Contact> {
      private ArrayList<T> phones = new ArrayList<>();

    public void add(T contact) {
        phones.add(contact);
    }

    public Contact getByPhone(long phone) {
        T result = null;
            for (int i = 0; i < phones.size(); i++) {
                T contact = phones.get(i);
                if (phones.get(i).getPhone() == phone) {
                    result = contact;
                    System.out.println(phones.get(i));
                }
            }
        return result;
        }
        public void removeByPhone ( long phone){
                T result = null;
                for (int i = 0; i < phones.size(); i++) {
                    if (phones.get(i).getPhone() == phone) {
                        phones.remove(i);
                    }
                }
            if (result == null) {
                throw new RuntimeException("неверно");
            }

        }

    }






