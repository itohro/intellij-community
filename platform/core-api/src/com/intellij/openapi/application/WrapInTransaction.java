package com.intellij.openapi.application;

import java.lang.annotation.*;

/**
 * Add this annotation to actions (AnAction, IntentionAction or QuickFix inheritors) to make them run inside a synchronous transaction.
 *
 * @see TransactionGuard
 * @since 146.*
 * @author peter
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface WrapInTransaction {

  /**
   * @return the kind of transaction to wrap the action into. By default, it's {@link TransactionKind#ANY_CHANGE}.
   */
  TransactionKind.Common value() default TransactionKind.Common.ANY_CHANGE;
}
