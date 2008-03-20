package org.jetbrains.plugins.scala.lang.psi.impl.toplevel.templates

import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode

import org.jetbrains.plugins.scala.lang.parser.ScalaElementTypes
import org.jetbrains.plugins.scala.lang.lexer._
import org.jetbrains.plugins.scala.lang.psi.ScalaPsiElementImpl
import org.jetbrains.plugins.scala.lang.lexer.ScalaTokenTypes
import org.jetbrains.annotations._
import org.jetbrains.plugins.scala.lang.parser.ScalaElementTypes

import org.jetbrains.plugins.scala.icons.Icons

import org.jetbrains.plugins.scala.lang.psi.api.toplevel.templates._


import com.intellij.psi.tree._

/** 
* Created by IntelliJ IDEA.
* User: Alexander.Podkhalyuz
* Date: 22.02.2008
* Time: 9:22:09
* To change this template use File | Settings | File Templates.
*/

class ScTemplateParentsImpl(node: ASTNode) extends ScalaPsiElementImpl(node) with ScTemplateParents {
  val STABLE_ID_BIT_SET = TokenSet.create(Array(ScalaElementTypes.STABLE_ID))

  //def getMainConstructor = getChild(ScalaElementTypes.CONSTRUCTOR).asInstanceOf[ScConstructor]

  //def getMixinParents = childrenOfType[ScStableId](STABLE_ID_BIT_SET)

  override def toString: String = "ClassParents"
}