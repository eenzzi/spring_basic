package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {

}
//MyExcludeComponent가 붙은 것은 컴포넌트스캔에 제외하겠다는 뜻