//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package springfox.documentation.builders;

import com.fasterxml.classmate.ResolvedType;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import springfox.documentation.schema.ModelProperty;
import springfox.documentation.schema.Xml;
import springfox.documentation.service.AllowableValues;
import springfox.documentation.service.VendorExtension;

import java.util.Date;
import java.util.List;

/**
 * 这个类从swagger源码复制，覆盖源码，重写example(String)方法，自定义日期转换字符串格式
 */
public class ModelPropertyBuilder {
	private ResolvedType type;
	private String qualifiedType;
	private int position;
	private Boolean required;
	private Boolean readOnly;
	private String description;
	private AllowableValues allowableValues;
	private String name;
	private boolean isHidden;
	private Object example;
	private String pattern;
	private String defaultValue;
	private Xml xml;
	private Boolean allowEmptyValue;
	private List<VendorExtension> vendorExtensions = Lists.newArrayList();

	public ModelPropertyBuilder() {
	}

	public ModelPropertyBuilder name(String name) {
		this.name = (String)BuilderDefaults.defaultIfAbsent(name, this.name);
		return this;
	}

	public ModelPropertyBuilder type(ResolvedType type) {
		this.type = BuilderDefaults.replaceIfMoreSpecific(type, this.type);
		return this;
	}

	public ModelPropertyBuilder qualifiedType(String qualifiedType) {
		this.qualifiedType = (String)BuilderDefaults.defaultIfAbsent(qualifiedType, this.qualifiedType);
		return this;
	}

	public ModelPropertyBuilder position(int position) {
		this.position = position;
		return this;
	}

	public ModelPropertyBuilder required(Boolean required) {
		this.required = required;
		return this;
	}

	public ModelPropertyBuilder readOnly(Boolean readOnly) {
		this.readOnly = readOnly;
		return this;
	}

	public ModelPropertyBuilder description(String description) {
		this.description = (String)BuilderDefaults.defaultIfAbsent(description, this.description);
		return this;
	}

	/** @deprecated */
	@Deprecated
	public ModelPropertyBuilder example(String example) {
//		原始代码
//		this.example = BuilderDefaults.defaultIfAbsent(example, this.example);

		// 覆盖源码，日期字符串格式化，这里的转换格式必须和springboot的json转换格式一致
		if ("java.util.Date" .equals(qualifiedType)) {
			this.example = new Date().getTime();
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			this.example = sdf.format(new Date());
		} else {
			this.example = BuilderDefaults.defaultIfAbsent(example, this.example);
		}
		return this;
	}

	public ModelPropertyBuilder example(Object example) {
		this.example = BuilderDefaults.defaultIfAbsent(example, this.example);
		return this;
	}

	public ModelPropertyBuilder allowableValues(AllowableValues allowableValues) {
		this.allowableValues = BuilderDefaults.emptyToNull(allowableValues, this.allowableValues);
		return this;
	}

	public ModelPropertyBuilder isHidden(Boolean isHidden) {
		this.isHidden = isHidden;
		return this;
	}

	public ModelPropertyBuilder pattern(String pattern) {
		this.pattern = (String)BuilderDefaults.defaultIfAbsent(pattern, this.pattern);
		return this;
	}

	public ModelPropertyBuilder extensions(List<VendorExtension> extensions) {
		this.vendorExtensions.addAll(BuilderDefaults.nullToEmptyList(extensions));
		return this;
	}

	public ModelPropertyBuilder defaultValue(String defaultValue) {
		this.defaultValue = (String)BuilderDefaults.defaultIfAbsent(defaultValue, this.defaultValue);
		return this;
	}

	public ModelPropertyBuilder allowEmptyValue(Boolean allowEmptyValue) {
		this.allowEmptyValue = allowEmptyValue;
		return this;
	}

	public ModelPropertyBuilder xml(Xml xml) {
		this.xml = (Xml)BuilderDefaults.defaultIfAbsent(xml, this.xml);
		return this;
	}

	public ModelProperty build() {
		if (this.xml != null && Strings.isNullOrEmpty(this.xml.getName())) {
			this.xml.setName(this.name);
		}

		return new ModelProperty(this.name, this.type, this.qualifiedType, this.position, this.required == null ? false : this.required, this.isHidden, this.readOnly == null ? false : this.readOnly, this.allowEmptyValue, this.description, this.allowableValues, this.example, this.pattern, this.defaultValue, this.xml, this.vendorExtensions);
	}
}
