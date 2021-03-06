/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.scripting.xmltags;

/**
 * @author Clinton Begin
 * 这个拼接字符串的中转对象，拼接sql
 *
 */
public interface SqlNode {

  // 根据用户传入的实参，解析该SqlNode所记录的动态SQL节点，并调用 DynamicContext.appendSql()方法将解析后的SQL片段追加到
  // DynamicContext.sqlBuilder中保存
  // 这个作用是根据传入的name, expression解析，解析之后进行绑定，context.bind(name, value)
  // 共享同一个 context
  // 返回bool类型，进行判断是否处理本次的Node
  boolean apply(DynamicContext context);
}
