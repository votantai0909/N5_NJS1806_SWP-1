import org.example.PasswordValidator;
import org.junit.Test;

import static org.junit.Assert.*;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPasswordValidator {
    @Test
    public void testIsPasswordStrong() throws Exception{
        PasswordValidator pv = new PasswordValidator();
        boolean isStrong = pv.isPasswordStrong("12345678");
        assertTrue(isStrong);
    }
    @Test
    public void testIsPasswordNotStrong() throws Exception{
        PasswordValidator pv = new PasswordValidator();
        boolean isStrong = pv.isPasswordStrong("1234");
        assertFalse(isStrong);
    }
    @Test
    public void testIsPasswordTooLong() throws Exception{
        PasswordValidator pv = new PasswordValidator();
        assertThrows(Exception.class, ()-> pv.isPasswordStrong("123456vhvjhjhfhj"));
    }
}
