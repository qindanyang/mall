/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.security.component;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import com.macro.mall.security.component.RestfulAccessDeniedHandler;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.security.access.AccessDeniedException;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RestfulAccessDeniedHandler_SSTest extends RestfulAccessDeniedHandler_SSTest_scaffolding {
// allCoveredLines:[18, 23, 24, 25, 26, 27, 28, 29]

  @Test(timeout = 4000)
  public void test_handle_0()  throws Throwable  {
      //caseID:0bda69946443e84ce15ea0bc7dddfc36
      //CoveredLines: [18, 23, 24, 25, 26, 27, 28, 29]
      //Input_0_HttpServletRequest: {}
      //Input_1_HttpServletResponse: {getWriter=printWriter0}
      //Input_2_AccessDeniedException: \"no-cache\"
      
      RestfulAccessDeniedHandler restfulAccessDeniedHandler0 = new RestfulAccessDeniedHandler();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock printWriter0
      PrintWriter printWriter0 = mock(PrintWriter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(printWriter0).when(httpServletResponse0).getWriter();
      AccessDeniedException accessDeniedException0 = new AccessDeniedException("no-cache");
      
      //Call method: handle
      restfulAccessDeniedHandler0.handle(httpServletRequest0, httpServletResponse0, accessDeniedException0);
  }
}
