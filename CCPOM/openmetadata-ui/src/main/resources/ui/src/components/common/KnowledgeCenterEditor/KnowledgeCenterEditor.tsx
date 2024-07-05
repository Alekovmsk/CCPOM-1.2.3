import React, { useRef, useCallback, useEffect, useImperativeHandle } from "react";

// import tools for editor config
import { EDITOR_JS_TOOLS } from "./tools/tools";

// create editor instance
import { createReactEditorJS } from "react-editor-js";
import exampleData from "./data/exampleData";
import { t } from "i18next";
import { Button } from "antd";
import { KnowledgeCenterEditorProps } from "./KnowledgeCenterEditor.interface";



const KnowledgeCenterEditor = ({
	data,
	setData,
	readOnly = false,
	editorJsRef,
}: KnowledgeCenterEditorProps) => {
	const editorCore = useRef(null);
	const ReactEditorJS = createReactEditorJS();

	const handleInitialize = useCallback((instance) => {
		instance._editorJS.isReady
			.then(() => {
				// set reference to editor
				editorCore.current = instance;
			})
			.catch((err) => console.log("An error occured", err));
	}, []);

	const handleSave = useCallback(async () => {
		const savedData = await editorCore.current.save();
		setData(savedData);
	}, [setData]);

	const rerender = (newData) => editorCore.current.render(newData);
	editorJsRef.current.rerender = rerender;



	return (
		<div className="editor-container">
			<ReactEditorJS
				readOnly={readOnly}
				onInitialize={handleInitialize}
				tools={EDITOR_JS_TOOLS}
				onChange={!readOnly ? handleSave : undefined}
				defaultValue={data}
				minHeight={100}
			/>
		</div>
	);
}

export default KnowledgeCenterEditor;
