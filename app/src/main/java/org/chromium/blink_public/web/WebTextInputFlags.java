
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../third_party/WebKit/public/platform/WebTextInputType.h

package org.chromium.blink_public.web;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebTextInputFlags.kNone, WebTextInputFlags.kAutocompleteOn, WebTextInputFlags.kAutocompleteOff,
    WebTextInputFlags.kAutocorrectOn, WebTextInputFlags.kAutocorrectOff,
    WebTextInputFlags.kSpellcheckOn, WebTextInputFlags.kSpellcheckOff,
    WebTextInputFlags.kAutocapitalizeNone, WebTextInputFlags.kAutocapitalizeCharacters,
    WebTextInputFlags.kAutocapitalizeWords, WebTextInputFlags.kAutocapitalizeSentences
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebTextInputFlags {
  int kNone = 0;
  int kAutocompleteOn = 1 << 0;
  int kAutocompleteOff = 1 << 1;
  int kAutocorrectOn = 1 << 2;
  int kAutocorrectOff = 1 << 3;
  int kSpellcheckOn = 1 << 4;
  int kSpellcheckOff = 1 << 5;
  int kAutocapitalizeNone = 1 << 6;
  int kAutocapitalizeCharacters = 1 << 7;
  int kAutocapitalizeWords = 1 << 8;
  int kAutocapitalizeSentences = 1 << 9;
}