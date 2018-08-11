package org.elm.lang.core.psi.elements

import com.intellij.lang.ASTNode
import com.intellij.psi.util.PsiTreeUtil
import org.elm.lang.core.psi.ElmPsiElementImpl
import org.elm.lang.core.psi.tags.ElmParametricTypeRefParameterTag
import org.elm.lang.core.psi.tags.ElmUnionMemberParameterTag


class ElmTupleType(node: ASTNode) : ElmPsiElementImpl(node), ElmUnionMemberParameterTag, ElmParametricTypeRefParameterTag {

    val typeRefList: List<ElmTypeRef>
        get() = PsiTreeUtil.getChildrenOfTypeAsList(this, ElmTypeRef::class.java)

    val unit: ElmUnit?
        get() = findChildByClass(ElmUnit::class.java)

}
