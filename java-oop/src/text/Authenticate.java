package text;

import practice01.Employee;

/**
 * 認証インターフェース
 * @author imagepit
 *
 */
public interface Authenticate {
	Employee authenticate(String username, String password);
}
