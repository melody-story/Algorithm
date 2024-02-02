class OrderedStream {
    private static String[] stream;
    private static Integer indx;
    private static int size;
    // 14:20 - 16:19
    public OrderedStream(int n) {
        stream = new String[n];
        indx = new Integer(0);
        size = n;
    }

    public List<String> insert(int idKey, String value) {
        stream[idKey-1] = value;
        List<String> list = getList();
        return list;
    }

    public List<String> getList(){
        List<String> objects = new ArrayList<>();
        while (indx < size && stream[indx] !=null){
            objects.add(stream[indx]);
            stream[indx]=null;
            indx++;
        }
        return objects;
    }
}