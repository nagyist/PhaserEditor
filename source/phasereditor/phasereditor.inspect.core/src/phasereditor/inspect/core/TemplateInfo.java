// The MIT License (MIT)
//
// Copyright (c) 2015 Arian Fornaris
//
// Permission is hereby granted, free of charge, to any person obtaining a
// copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to permit
// persons to whom the Software is furnished to do so, subject to the
// following conditions: The above copyright notice and this permission
// notice shall be included in all copies or substantial portions of the
// Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
// OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
// NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
// DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
// OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE
// USE OR OTHER DEALINGS IN THE SOFTWARE.
package phasereditor.inspect.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class TemplateInfo {
	private String _author;
	private String _email;
	private String _website;
	private String _mainFile;
	private String _description;
	private String _url;
	private Map<String, List<String>> _eval;
	private String _id;
	private boolean _typescript;

	public TemplateInfo() {
	}

	public TemplateInfo(JSONObject jsonTemplManifest) {
		_mainFile = jsonTemplManifest.optString("mainFile");
		_description = jsonTemplManifest.optString("description", "");

		JSONObject jsonAuthor = jsonTemplManifest.getJSONObject("author");
		_author = jsonAuthor.optString("name", "");
		_email = jsonAuthor.optString("email", "");
		_website = jsonAuthor.optString("website", "");
		_url = jsonTemplManifest.optString("url", null);
		{
			_eval = new HashMap<>();
			JSONObject data = jsonTemplManifest.optJSONObject("eval");
			if (data != null) {
				for (String k : data.keySet()) {
					JSONArray array = data.getJSONArray(k);
					List<String> list = new ArrayList<>();
					for (int i = 0; i < array.length(); i++) {
						list.add(array.getString(i));
					}
					_eval.put(k, list);
				}
			}
		}
		_id = jsonTemplManifest.optString("id");
		_typescript = jsonTemplManifest.optBoolean("typescript", false);
	}

	public boolean isTypescript() {
		return _typescript;
	}

	public Map<String, List<String>> getEval() {
		return _eval;
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getWebsite() {
		return _website;
	}

	public void setWebsite(String website) {
		_website = website;
	}

	public String getMainFile() {
		return _mainFile;
	}

	public void setMainFile(String mainFile) {
		_mainFile = mainFile;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getUrl() {
		return _url;
	}

	public String getId() {
		return _id;
	}
}
