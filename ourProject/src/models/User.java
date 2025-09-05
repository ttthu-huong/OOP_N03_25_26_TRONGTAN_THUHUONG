
public class User {
    private String userId;
    private String name;
    private String email;

    // Constructor (bắt buộc các thông tin chính)
    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Setters
    public void setUserId(String userId) { this.userId = userId; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    // Kiểm tra dữ liệu hợp lệ (ví dụ bắt buộc, đơn giản)
    public boolean isValid() {
        if (userId == null || userId.trim().isEmpty()) return false;
        if (name == null || name.trim().isEmpty()) return false;
        if (email == null || !email.contains("@")) return false;
        return true;
    }

    public void showInfo() {
        System.out.println("User{ id=" + userId + ", name=" + name + ", email=" + email + " }");
    }
}
