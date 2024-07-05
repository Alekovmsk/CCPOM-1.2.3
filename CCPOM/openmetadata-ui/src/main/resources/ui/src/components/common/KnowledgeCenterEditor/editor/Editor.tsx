import React, { useRef, useCallback, useEffect, useImperativeHandle } from "react";

// import tools for editor config
import { EDITOR_JS_TOOLS } from "./tools/tools";

// create editor instance
import { createReactEditorJS } from "react-editor-js";
import exampleData from "./data/exampleData";
import { t } from "i18next";
import { Button } from "antd";

export default function Editor({ data, setData, onSave, readOnly=false, editorJsRef, isMinHeight }) {
	const editorCore = useRef(null);
	const ReactEditorJS = createReactEditorJS();

	const handleInitialize = useCallback((instance) => {
		// await instance._editorJS.isReady;
		instance._editorJS.isReady
			.then(() => {
				// set reference to editor
				editorCore.current = instance;
			})
			.catch((err) => console.log("An error occured", err));
	}, []);
	
	const minHeight = isMinHeight ? 0 : 200;

	const handleSave = useCallback(async () => {
		// retrieve data inserted
		const savedData = await editorCore.current.save();
		// save data
		// onSave(JSON.stringify(savedData));
		setData(savedData);
	}, [setData]);

	// useEffect(() => {editorCore.current.render(data)}, [data]);
	const rerender = (newData) => editorCore.current.render(newData);
    editorJsRef.current.rerender = rerender;
	// readOnly = false;



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
			{/* <></> */}
			{/* <Button
				data-testid="save"
				key="saveButton"
				type="primary"
				onClick={handleSave}>
				{t('label.save')}
          </Button> */}
		</div>
	);
}
