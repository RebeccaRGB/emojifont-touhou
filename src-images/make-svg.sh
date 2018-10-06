#!/usr/bin/env bash
mkdir -p TouhouKatsujishotai.ttf.svg.d
java Srep grep-pua.txt < 8Wo-collapsed-plain.svg > TouhouKatsujishotai.ttf.svg.d/char_F000-F001+F016+F01B+F020-F032+F037-F047+F04C-F065+F067-F06D+F06F-F089.svg
java Srep grep-ascii.txt < 8Wo-collapsed-plain.svg > TouhouKatsujishotai.ttf.svg.d/char_21-7E.svg
