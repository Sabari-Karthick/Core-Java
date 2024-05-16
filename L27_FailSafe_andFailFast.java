import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author _karthick V94SP9F8NYR6GHB26S6AEQY2
 *
 *  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
 *
 *
 *modification of collection while accessing the data -->Structural modification
 *Structural modification leads to infinity loop
 *__>>It is not Fail Fast and it needs to make as Fail Fast
 *
 *Iterator promotes Fail Fast that is concurrent modification is not possible
 *Fail fast throws exception but does not allow concurrent modification
 *
 *-->to achieve fail safe we need to use CopyOnwriteArrayList class. 
 *
 *
 *-->fail safe --> does not allow structural modification and does not throw exception
 *
 *to achieve fail_safe we need to use concurrent packages 
 *
 *
 */
public class L27_FailSafe_andFailFast {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(123);
		l.add(1234);
//----->Advantage of iterator		
//	for(int i=0;i<l.size();i++) {
//		System.out.println(l.get(i));
//		l.add(12345);//-->Structural modification
//	}
//		Iterator itr = l.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());//it implements fail FAST
//			l.add(123456);
//		}
		
		CopyOnWriteArrayList c = new CopyOnWriteArrayList();
		c.add(2);
		c.add(22);
		c.add(222);
		Iterator itr2 = c.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
			c.add(2222);//here failed safe that is no exception
		}
		
	}

}
