package com.tencent.hellplugin

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class Hell1MethodVisitor extends MethodVisitor {

    Hell1MethodVisitor(MethodVisitor mv) {
        super(Opcodes.ASM5, mv)
    }

    @Override
    void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
        super.visitMethodInsn(opcode, owner, name, desc, itf)
    }

    @Override
    void visitInsn(int opcode) {
        super.visitInsn(opcode)
    }
}
