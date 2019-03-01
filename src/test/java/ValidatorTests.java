import com.company.PasswordConstraintValidator;
import org.junit.Assert;
import org.junit.Test;
import org.passay.PasswordData;
import org.passay.RuleResult;
import org.passay.RuleResultDetail;

public class ValidatorTests {

    @Test
    public void checkConstraints() {
        PasswordData passwordData = new PasswordData();
        passwordData.setPassword("Coco1 ");
        RuleResult result = PasswordConstraintValidator.INSTANCE.get().validate(passwordData);

        if (!result.isValid()) {
            for (RuleResultDetail detail : result.getDetails())
                System.out.println("-" + detail);

            Assert.assertFalse(result.isValid());
        }
    }
}
