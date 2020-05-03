public class Listen<E> {

    class ListenElement<Typ> {

        private Typ data = null;
        private ListenElement<Typ> next;

        public ListenElement() {
            this(null);
        }

        public ListenElement(Typ data) {
            this.data = data;
        }

        public void setNext(ListenElement<Typ> next) {
            this.next = next;
        }

        public ListenElement<Typ> getNext() {
            return this.next;
        }

        public void setData(Typ data) {
            this.data = data;
        }

        public Typ getData() {
            return this.data;
        }
    }

    private ListenElement kopf;
    private ListenElement rest;

    public Listen() {
    kopf = new ListenElement < E >();
    rest = new ListenElement < E >();
    kopf.next = rest;
    rest.next = kopf;
    }

    public ListenElement getKopf() {
        return kopf;
    }

    public boolean is_a_list(Listen<E> l1) {
        if (l1 == null) ;
        else {
            ListenElement<E> k = kopf;
            ListenElement<E> r = rest;
            while((k.getNext() == rest)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Listen l1 = new Listen();
        l1.is_a_list(l1);

    }


}