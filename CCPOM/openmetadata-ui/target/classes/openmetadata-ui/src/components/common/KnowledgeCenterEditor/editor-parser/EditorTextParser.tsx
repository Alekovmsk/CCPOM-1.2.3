// edjsHTML tranforms editor js blocks to html
import edjsHTML from "editorjs-html";
// this function parses strings (html elements) to html
import parse from "html-react-parser";
import React from "react";
const edjsParser = edjsHTML();

export default function EditorTextParser({ data }) {
  // array of html elements
  const html = edjsParser.parse(data);
  console.log('EditorTextParser!');
  console.log(data);

  return <div className="text-container">{parse(html.join(""))}</div>;
}
