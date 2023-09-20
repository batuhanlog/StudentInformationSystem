public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double sozluNoteEtkisi; // Sözlü not etkisi yüzdesi

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNoteEtkisi = 0.20; // Varsayılan olarak %20
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public void setSozluNoteEtkisi(double sozluNoteEtkisi) {
        if (sozluNoteEtkisi >= 0 && sozluNoteEtkisi <= 1) {
            this.sozluNoteEtkisi = sozluNoteEtkisi;
        } else {
            System.out.println("Geçersiz sözlü not etkisi yüzdesi. 0 ile 1 arasında bir değer giriniz.");
        }
    }
}
