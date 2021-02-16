package com.tests.emoji;

import cn.hutool.extra.emoji.EmojiUtil;
/**
 * @desc   表情
 * @author JZH
 *
 */
public class Test {
	public static void main(String[] args) {
		String alias = EmojiUtil.toAlias("😄");//:smile:
		System.out.println(alias);
		
		String emoji = EmojiUtil.toUnicode(":smile::cat2:");
		System.out.println(emoji);
	}
}
