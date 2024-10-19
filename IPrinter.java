package dom;

interface IPrint {
    void Print(String content);
}

interface IScan {
    void Scan(String content);
}

interface IFax {
    void Fax(String content);
}

class AllInOnePrinter implements IPrint, IScan, IFax {
    public void Print(String content) {
        System.out.println("Printing: " + content);
    }

    public void Scan(String content) {
        System.out.println("Scanning: " + content);
    }

    public void Fax(String content) {
        System.out.println("Faxing: " + content);
    }
}

class BasicPrinter implements IPrint {
    public void Print(String content) {
        System.out.println("Printing: " + content);
    }
}
