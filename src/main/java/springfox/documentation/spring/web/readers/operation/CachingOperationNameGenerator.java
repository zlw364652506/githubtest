//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package springfox.documentation.spring.web.readers.operation;

import com.google.common.collect.Maps;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import springfox.documentation.OperationNameGenerator;

@Component
public class CachingOperationNameGenerator implements OperationNameGenerator {
	private static final Logger LOG = LoggerFactory.getLogger(CachingOperationNameGenerator.class);
	private Map<String, Integer> generated = Maps.newHashMap();

	public CachingOperationNameGenerator() {
	}

	public String startingWith(String prefix) {
		if (this.generated.containsKey(prefix)) {
			this.generated.put(prefix, (Integer)this.generated.get(prefix) + 1);
			String nextUniqueOperationName = String.format("%s_%s", prefix, this.generated.get(prefix));
			// 覆盖swagger源码，注释掉打印
//			LOG.info("Generating unique operation named: {}", nextUniqueOperationName);
			return nextUniqueOperationName;
		} else {
			this.generated.put(prefix, 0);
			return prefix;
		}
	}
}
