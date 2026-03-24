class Test {
    public static void main(String[] args) {
        String name = "Harshita";
        int code = name.hashCode();
        System.out.println("Name's hashCode :" + code);
    }
}

/*
    hashCode() is a method that returns an integer value used to identify  
    objects in hashing-based data structures; it is not guaranteed to be unique.

    hashCode() is implemented by the JVM via the Object class, but can be 
    overridden to define custom hashing logic.

    If two objects are equal, they must have the same hashCode, otherwise 
    hash-based collections will behave incorrectly.
*/
