package example.codeclash10.domain.entities;

public class StudentCode {
    private Integer studentCodeId;
    private String fileContentUrl;
    private Integer roundId;
    private Integer gameId;

    public StudentCode() {
    }
    public StudentCode(String filePath){
        fileContentUrl = filePath;
    }
}
